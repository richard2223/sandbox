package za.co.absa.bas.fx.file;

import org.apache.camel.dataformat.bindy.BindyFixedLengthFactory;
import za.co.absa.bas.fx.domain.BASRecord;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by loyiso on 2017/09/14.
 */
public class FileUtility {
    public void readFile(){
        System.out.println("readFile()");
    }

    public void writeOutputFile(){
        System.out.println("writeOutputFile()");
    }

    public BASRecord readLine(String line){
        try {
            BASRecord formatModel =  new BASRecord();
            String name = formatModel.getClass().getName();
            Map<String, Object> row = new HashMap<String, Object>();
            row.put(name, formatModel);
            BindyFixedLengthFactory factory = new BindyFixedLengthFactory(BASRecord.class);
//            factory.bind(source.getRecord(), row, source.getLineNumber());
            factory.bind(line,row,1);
            return formatModel;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
