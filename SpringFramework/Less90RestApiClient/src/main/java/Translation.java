public class Translation {
    private String text;
    private String detectedLanguageCode;

    public String getDetectedLanguageCode() {
        return detectedLanguageCode;
    }

    public void setDetectedLanguageCode(String detectedLanguageCode) {
        this.detectedLanguageCode = detectedLanguageCode;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
