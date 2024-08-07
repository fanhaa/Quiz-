/**
* dialectを継承した博多弁具象クラス
 * @author T.INOUE
 * @reviewer 大岡勇輝
 * @reviewer 伊藤雄規
*/
public class hakata_Dialect extends dialect {

    /**
     * 博多弁の配列を保持
     */
    String word [] ={
     "ばり感謝ばい","とったい","捨てる","あたらしか","駐車場", 
     "おひめさま","きんしゃい","すいとー","ちゃちゃくちゃら","しぇからしか", 
     "ばいばい","触る","かっこつけよる","汚い","もったいなか", 
     "おはようさん","いただきます","ごちそうさま","沖縄","うまか",
    };

    /**
     * 配列の説明
     */

    public void speak() {
        System.out.println("hakata_Dialectは博多弁をまとめた配列だよ");
    }
}
