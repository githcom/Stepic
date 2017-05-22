/**
 * Created by AVK on 08.04.2017.
 */
public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    String [] keywords = {":(", "=(", ":|"};


    @Override
    public Label processText(String text) {
        for (int i = 0; i < getKeywords().length; i++) {
            if (text.contains(keywords[i])){
                return getLabel();
            }
        }
        return Label.OK;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
