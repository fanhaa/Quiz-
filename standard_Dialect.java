/**
 * dialectを継承した標準語具象クラス
 * 
 * @author T.INOUE
 * @reviewer 大岡勇輝
 * @reviewer 伊藤雄規
 */
public class standard_Dialect extends dialect{

    /**
     * 標準語の配列を保持
     */
    String word [] ={
     "ありがとう","友達","捨てる","さとうきび","家族", 
     "ものもらい","おいでなさい","好き","恋人","うるさい",
     "さようなら","大量出血","嘘つき","かき氷","乾杯",
     "おはようございます","いただきます","ごちそうさまでした","沖縄","おいしい",
    };

    /**
    * 配列の説明
    */

    public void speak() {
        System.out.println("standard_Dialectは標準語をまとめた配列だよ");
    }

    
    
}
