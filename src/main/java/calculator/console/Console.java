package calculator.console;

import calculator.domain.SelectOption;

public class Console {
    private final Reader reader;
    private final Writer writer;

    public Console() {
        this.reader = new Reader();
        this.writer = new Writer();
    }

    public void getUserSelection() {
        writer.printSelectOption(SelectOption.getLiterals());
    }
}
