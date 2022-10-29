package pr21_22;

public class CreateTextDocument implements ICreateDocument {

    @Override
    public IDocument CreateNew() {
        System.out.println("new text doc");
        return new TextDocument();
    }

    @Override
    public IDocument CreateOpen() {
        System.out.println("open text doc");
        return new TextDocument();
    }
}
