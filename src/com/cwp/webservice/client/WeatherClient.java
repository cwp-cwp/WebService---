package com.cwp.webservice.client;

import com.cwp.webservice.implement.WeatherInterfaceImpl;
import com.cwp.webservice.implement.WeatherInterfaceImplService;

/**
 * 天气查询客户端
 * 
 * 服务端先发布服务，然后在 cmd 命令窗口执行: wsimport -s F:ws http://127.0.0.1:12345/weather?wsdl
 * 
 * (注意要在 F盘下创建 ws 目录) 将 ws 目录下生成的代码复制到该项目中
 * 
 * @author 叔公
 * 
 */
public class WeatherClient {

	public static void main(String[] args) {
		// 创建服务视图
		WeatherInterfaceImplService weatherInterfaceImplService = new WeatherInterfaceImplService();

		// 获取服务实现类
		WeatherInterfaceImpl weatherInterfaceImpl = weatherInterfaceImplService
				.getPort(WeatherInterfaceImpl.class);

		// 调用查询方法，打印
		String weather = weatherInterfaceImpl.queryWeather("北京");

		System.out.println(weather);
	}

}
