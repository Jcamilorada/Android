package com.example.ksoap;

import java.io.IOException;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

public class SoapUtil {
	private static final String SOAP_ACTION = "http://www.webserviceX.NET/ChangeAngleUnit";
	private static final String METHOD_NAME = "ChangeAngleUnit";
	private static final String NAMESPACE = "http://www.webserviceX.NET/";
	private static final String URL = "http://www.webservicex.net/ConvertAngle.asmx";

	public static Long ConvertAngle(int Value) throws IOException,
			XmlPullParserException {
		SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);

		PropertyInfo fromAngleUnit = new PropertyInfo();
		fromAngleUnit.name = "fromAngleUnit";
		fromAngleUnit.type = PropertyInfo.STRING_CLASS;
		fromAngleUnit.setValue("degrees");

		PropertyInfo toAngleUnit = new PropertyInfo();
		toAngleUnit.name = "toAngleUnit";
		toAngleUnit.type = PropertyInfo.STRING_CLASS;
		toAngleUnit.setValue("minutes");

		PropertyInfo AngleValue = new PropertyInfo();
		AngleValue.name = "AngleValue";
		AngleValue.type = Double.class;
		AngleValue.setValue(Value);

		request.addProperty(fromAngleUnit);
		request.addProperty(toAngleUnit);
		request.addProperty(AngleValue);

		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.setOutputSoapObject(request);
		envelope.dotNet = true;

		HttpTransportSE httpTransport = new HttpTransportSE(URL);

		httpTransport.call(SOAP_ACTION, envelope);
		SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
		return Long.parseLong(response.getValue().toString());

	}

}
