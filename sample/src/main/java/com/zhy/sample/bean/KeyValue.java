package com.zhy.sample.bean;

import com.zhy.sample.R;

import java.util.ArrayList;
import java.util.List;

public class KeyValue
{
	private String key;
	private String value;
	private boolean isHeader;

	public final static int HEADER = 0;
	public final static int KEY_VALUE = 1;

	public KeyValue(String key, String value, boolean isHeader)
	{
		this.key = key;
		this.value = value;
		this.isHeader = isHeader;
	}

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isHeader() {
        return isHeader;
    }

    public void setIsHeader(boolean isHeader) {
        this.isHeader = isHeader;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



    public static List<KeyValue> MOCK_DATAS = new ArrayList<>();

    @Override
    public String toString() {
        return "KeyValue{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", isHeader=" + isHeader +
                '}';
    }

    static {
		KeyValue keyValue = null;
		keyValue = new KeyValue("主体参数", "", true);
		MOCK_DATAS.add(keyValue);
		keyValue = new KeyValue("电视类别", "平板电视", false);
		MOCK_DATAS.add(keyValue);
        keyValue = new KeyValue("分辨率", "3840*2160", false);
        MOCK_DATAS.add(keyValue);
        keyValue = new KeyValue("尺寸", "51英寸", false);
        MOCK_DATAS.add(keyValue);
        keyValue = new KeyValue("基本参数", "", true);
        MOCK_DATAS.add(keyValue);
        keyValue = new KeyValue("电视3功能", "不支持", false);
        MOCK_DATAS.add(keyValue);
        keyValue = new KeyValue("背光寿命", "100000", false);
        MOCK_DATAS.add(keyValue);
        keyValue = new KeyValue("显示参数", "", true);
        MOCK_DATAS.add(keyValue);
        keyValue = new KeyValue("亮度", "200", false);
        MOCK_DATAS.add(keyValue);
        keyValue = new KeyValue("音频参数", "", true);
        MOCK_DATAS.add(keyValue);
        keyValue = new KeyValue("扬声器数量", "2", false);
        MOCK_DATAS.add(keyValue);




	}


}
