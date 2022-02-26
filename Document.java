public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public Document(){}

    public void setDocument(String content,String fontName,int fontSize){
        this.setContent(content);
        this.setFontName(fontName);
        this.setFontSize(fontSize);
    }

    public DocumentState createSate(){
        return new DocumentState(this.content,this.fontName,this.fontSize);
    }

    public void restore(DocumentState state){
        this.content=state.getContent();
        this.fontName=state.getFontName();
        this.fontSize=state.getFontSize();
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
        return "Document{" +
                "content='" + this.getContent() + '\'' +
                ", fontName='" + this.getFontName() + '\'' +
                ", fontSize=" + this.getFontSize() +
                '}';
    }
}
