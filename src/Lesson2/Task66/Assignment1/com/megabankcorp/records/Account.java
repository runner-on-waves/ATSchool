package Lesson2.Task66.Assignment1.com.megabankcorp.records;

import java.math.BigDecimal;

public class Account {
    private BigDecimal currentSum;
    private long currentAccountId;

    public long getCurrentAccountId() {
        return currentAccountId;
    }

    private long clientId;

    public BigDecimal getCurrentSum() {
        return currentSum;
    }

    public long getClientId() {
        return clientId;
    }
}
