/**
 * dialectを継承した北海道弁具象クラス
 * 
 * @author T.INOUE
 * @reviewer 大岡勇輝
 * @reviewer 伊藤雄規
 */
public class hokkaido_Dialect extends dialect {

    /**
     * 北海道弁の配列を保持
     */
   
        String word [] ={

            "ありがとさん","友達","捨てんべさ","さとうきび","駐車場",
            "めばちこ","おいでなさいや","すきだべさ","恋人","うるさいっしょ",
            "したっけ","大量出血","嘘つき","かき氷","乾杯",
            "おはようさんだべさ","いただきますべさ","ごちそうさまでしたっしょ","沖縄","うまいべさ"
          
        };

        /**
         * 配列の説明
         */

        public void speak() {
            System.out.println("hokkaido_Dialectは北海道弁をまとめた配列だよ");
        }

     
}