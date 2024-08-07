/**
 * dialectを継承した沖縄弁具象クラス
 * 
 * @author T.INOUE
 * @reviewer 大岡勇輝
 * @reviewer 伊藤雄規
 */
public class okinawa_Dialect extends dialect  {

  /**
     * 沖縄弁の配列を保持
     */
    String word [] ={
      "ふぇーでーびる","どぅし","すてーる","うーじ","やーにんじゅ",
      "まぶたんのふくろ","おいでいん","すきー","うむやー","うるさい", 
      "じゃねー","ちーごーごー","ゆくさー","ぜんざい","かりーさびら",
      "うきみそーちー","くわっちーさびら","くわっちさーびたん","うちなー","まーさん",
    };

    /**
    * 配列の説明
    */

    public void speak() {
      System.out.println("okinawa_Dialectは沖縄弁をまとめた配列だよ");
  }

  }
