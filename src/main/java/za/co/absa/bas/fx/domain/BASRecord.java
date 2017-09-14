package za.co.absa.bas.fx.domain;


import lombok.Data;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

/**
 * Created by loyiso on 2017/09/14.
 */
@Data
@FixedLengthRecord(length=171, paddingChar=' ',ignoreTrailingChars=true)
public class BASRecord {

    @DataField(pos = 1, length=15, align="L")
    private String first;

    @DataField(pos = 2, length=12)
    private String second;

    @DataField(pos = 3, length=6)
    private String type;

    @DataField(pos = 4, length=24, align="L")
    private String fourth;

    @DataField(pos = 5, length=32, align="L")
    private String description;

    @DataField(pos = 6, length=8, align="L")
    private String date;

    @DataField(pos = 7, length=62, align="L")
    private String bank;

    @DataField(pos = 7, length=62, align="L")
    private String bankAccount;

}
