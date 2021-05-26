package com.bloxbean.cardano.client.transaction.model;

import com.bloxbean.cardano.client.account.Account;
import com.bloxbean.cardano.client.transaction.spec.MultiAsset;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
/**
 * For payment transaction both in ADA (Lovelace) or Native tokens
 */
public class PaymentTransaction {
    private Account sender;
    private String receiver;
    private String unit;
    private BigInteger amount;
    private BigInteger fee;
    private List<MultiAsset> mintAssets;

    public BigInteger getAmount() {
        if(amount != null)
            return amount;
        else
            return BigInteger.ZERO;
    }
}
