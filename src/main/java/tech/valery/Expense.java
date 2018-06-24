package tech.valery;

import java.math.BigDecimal;
import java.util.Date;

public class Expense {

    private long id;

    private final User user;

    public final BigDecimal amount;
    public final Date date;
    private final String comment;

    public Expense(BigDecimal amount, User user, Date date, String comment) {
        this.amount = amount;
        this.user = user;
        this.date = date;
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}
