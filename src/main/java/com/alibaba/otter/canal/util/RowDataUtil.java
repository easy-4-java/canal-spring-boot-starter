package com.alibaba.otter.canal.util;

import com.alibaba.otter.canal.protocol.CanalEntry;

import java.util.List;
import java.util.Objects;

public class RowDataUtil {

    public static String getBeforeValue(CanalEntry.RowData rowData, String columnName) {
        if(Objects.isNull(rowData)){
            return null;
        }
        List<CanalEntry.Column> beforeColumnsList = rowData.getBeforeColumnsList();
        if(Objects.isNull(beforeColumnsList)){
            return null;
        }
        for (CanalEntry.Column column : beforeColumnsList) {
            if (column.getName().equalsIgnoreCase(columnName)) {
                return Objects.toString(column.getValue(), null);
            }
        }
        return null;
    }

    public static String getAfterValue(CanalEntry.RowData rowData, String columnName) {
        if(Objects.isNull(rowData)){
            return null;
        }
        List<CanalEntry.Column> afterColumnsList = rowData.getAfterColumnsList();
        if(Objects.isNull(afterColumnsList)){
            return null;
        }
        for (CanalEntry.Column column : afterColumnsList) {
            if (column.getName().equalsIgnoreCase(columnName)) {
                return  Objects.toString(column.getValue(), null);
            }
        }
        return null;
    }

    public static String getValue(CanalEntry.RowData rowData, String columnName) {
        String value = getBeforeValue(rowData, columnName);
        if(Objects.isNull(value)){
            return getAfterValue(rowData, columnName);
        }
        return value;
    }

}
