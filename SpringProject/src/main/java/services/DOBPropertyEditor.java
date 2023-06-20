package services;


import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DOBPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String value) throws IllegalArgumentException {
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate=LocalDate.parse(value,dateTimeFormatter);
        setValue(localDate);
    }
}
