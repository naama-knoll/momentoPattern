import java.util.Stack;

public class History {
    private Stack<DocumentState> states=new Stack<>();

    public History() {}

    public void push(DocumentState state){
        states.push(state);
    }

    public DocumentState pop(){
        return states.pop();
    }


    @Override
    public String toString() {
        return "History{" +
                "states=" + states +
                '}';
    }
}
