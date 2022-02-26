public class DocumentState {
    private String content;
    private String fontName;
    private int fontSize;

    public DocumentState(String content, String fontName, int fontSize) {
        this.setContent(content);
        this.setFontName(fontName);
        this.setFontSize(fontSize);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "DocumentState{" +
                "content='" + this.getContent() + '\'' +
                ", fontName='" + this.getFontName()+ '\'' +
                ", fontSize=" + this.getFontSize() +
                '}';
    }
}
