
public class Main {
    public static void main(String[] args) {

    
        Document doc=new Document();
        History historyList=new History();

        doc.setDocument("naama","aria",12);
        historyList.push(doc.createSate());

        doc.setDocument("moshe","aria",16);

        System.out.println(doc);
        System.out.println(historyList);

        doc.restore(historyList.pop());

        System.out.println(doc);
    }
   

}
