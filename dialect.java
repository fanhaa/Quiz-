import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 沖縄弁クイズ
 * ５つのウィンドウの問題をクリアせよ
 * 
 * @author T.INOUE
 * @reviewer 大岡勇輝
 * @reviewer 伊藤雄規
 */
public abstract class dialect extends Object {


    Random random = new Random();
    int randomNumber2 = random.nextInt(20);
    int randomNumber3 = random.nextInt(20);
    int randomNumber4 = random.nextInt(20);
    int randomNumber5 = random.nextInt(20);

    /**
     * 抽象化メソッド　各方言classで配列の説明を出力
     * 
     */
    public abstract void speak();

    /**
     * 沖縄弁クイズ
     * Jframeでウィンドウを作り、ドロップダウンメニューで択を出す
     */


    public void perform() {
        standard_Dialect aStandard_dialect = new standard_Dialect();
        kannsai_Dialect aKannsai_Dialect = new kannsai_Dialect();
        hakata_Dialect aHakata_Dialect = new hakata_Dialect();
        hokkaido_Dialect aHokkaido_Dialect = new hokkaido_Dialect();
        okinawa_Dialect aOkinawa_Dialect = new okinawa_Dialect();

        JFrame frame = new JFrame("沖縄弁クイズ！！");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        // パネルの作成
        JPanel panel = new JPanel();

        // ラベルの作成
        JLabel label = new JLabel("沖縄弁と同じ意味の方言を当ててください！");
        JLabel label2 = new JLabel("沖縄弁：" + aOkinawa_Dialect.word[randomNumber2]);

        // ドロップダウンメニューの作成
        String[] menu = {
            aHakata_Dialect.word[randomNumber3],
            aHokkaido_Dialect.word[randomNumber4],
            aKannsai_Dialect.word[randomNumber2],
            aStandard_dialect.word[randomNumber5]
        };

        JComboBox<String> comboBox = new JComboBox<>(menu);

        // ボタンの作成
        JButton button = new JButton("比較");

        // 結果を表示する
        JLabel resultLabel = new JLabel("結果: ");

        // ボタンアクション
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index1 = comboBox.getSelectedIndex();
                int index2 = -1;

                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].equals(aKannsai_Dialect.word[randomNumber2])) {
                        index2 = i;
                        break;
                    }
                }

                // 判定結果の表示
                if (index1 == index2) {
                    resultLabel.setText("素晴らしい！正解！");
                } else {
                    resultLabel.setText("残念です！ 不正解！");
                }
            }
        });

        // パネルに追加
        panel.add(label);
        panel.add(label2);
        panel.add(comboBox);
        panel.add(button);
        panel.add(resultLabel);

        // フレームにパネルを追加
        frame.add(panel);

        // フレームを表示
        frame.setVisible(true);

        speak();
    }
}