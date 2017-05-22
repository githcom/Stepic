/**
 * Created by AVK on 08.04.2017.
 */
public abstract class KeywordAnalyzer implements TextAnalyzer {

    abstract protected String [] getKeywords();

    abstract protected Label getLabel();

    public Label processText(String text){
        for (int i = 0; i < getKeywords().length; i++) {
            if (text.contains(getKeywords()[i])){
                return getLabel();
            }
        }
        return Label.OK;
    }
}
