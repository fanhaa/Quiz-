/**
 * これから始まります
 * 
 * @author T.INOUE
 * @reviewer 大岡勇輝
 * @reviewer 伊藤雄規
 */
public class Main extends Object{

    /**
     * メイン
     */

    public static void main(String[] args) {
        dialect []  dialects= {

            new standard_Dialect(),
            new hokkaido_Dialect(),
            new okinawa_Dialect(),
            new kannsai_Dialect(),
            new hakata_Dialect()
            
        };

    for (dialect aDialect : dialects) {
        aDialect.perform();
    }
    
    }
}
