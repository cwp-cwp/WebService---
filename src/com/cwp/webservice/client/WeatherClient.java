package com.cwp.webservice.client;

import com.cwp.webservice.implement.WeatherInterfaceImpl;
import com.cwp.webservice.implement.WeatherInterfaceImplService;

/**
 * ������ѯ�ͻ���
 * 
 * ������ȷ�������Ȼ���� cmd �����ִ��: wsimport -s F:ws http://127.0.0.1:12345/weather?wsdl
 * 
 * (ע��Ҫ�� F���´��� ws Ŀ¼) �� ws Ŀ¼�����ɵĴ��븴�Ƶ�����Ŀ��
 * 
 * @author �幫
 * 
 */
public class WeatherClient {

	public static void main(String[] args) {
		// ����������ͼ
		WeatherInterfaceImplService weatherInterfaceImplService = new WeatherInterfaceImplService();

		// ��ȡ����ʵ����
		WeatherInterfaceImpl weatherInterfaceImpl = weatherInterfaceImplService
				.getPort(WeatherInterfaceImpl.class);

		// ���ò�ѯ��������ӡ
		String weather = weatherInterfaceImpl.queryWeather("����");

		System.out.println(weather);
	}

}
