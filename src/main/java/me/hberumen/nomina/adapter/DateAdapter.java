package me.hberumen.nomina.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hberumen on 31/01/17.
 */
public class DateAdapter extends XmlAdapter<String,Date>{

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date unmarshal(String v) throws Exception {
        if(v == null){
            return null;
        }
        synchronized (dateFormat) {
            return dateFormat.parse(v);
        }
    }

    @Override
    public String marshal(Date v) throws Exception {
        if(v == null){
            return null;
        }
        synchronized (dateFormat) {
            return dateFormat.format(v);
        }
    }
}
