/**
 * dialectを継承した関西弁具象クラス
 * 
 * @author T.INOUE
 * @reviewer 大岡勇輝
 * @reviewer 伊藤雄規
 */
public class kannsai_Dialect extends dialect  {

    /**
     * 関西弁の配列を保持
     */

    String word [] ={
      "おおきに","つれ","ほかす","さとうきび","家族",
      "めばちこ","おいでやす","好きやで","恋人","うるさいで", 
      "ほな、さいなら","大量出血","嘘つき","かき氷","乾杯",
      "おはようさん","いただきまーす","ごちそうさま","沖縄","うまい",
    };

    /**
     * 配列の説明
     */
    public void speak() {
      System.out.println("kannsai_Dialectは関西弁をまとめた配列だよ");
    }

}
