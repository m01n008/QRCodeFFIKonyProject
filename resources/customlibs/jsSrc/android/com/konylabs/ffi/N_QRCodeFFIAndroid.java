package com.konylabs.ffi;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;
import com.konylabs.api.TableLib;
import com.konylabs.vm.LuaTable;



import com.moin.qrcodeffiandroid.QRCodeFFIAndroid;
import com.konylabs.libintf.Library;
import com.konylabs.libintf.JSLibrary;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;


public class N_QRCodeFFIAndroid extends JSLibrary {

 
 
	public static final String genQRCode = "genQRCode";
 
 
	public static final String scanQRCode = "scanQRCode";
 
	String[] methods = { genQRCode, scanQRCode };


 Library libs[] = null;
 public Library[] getClasses() {
 libs = new Library[0];
 return libs;
 }



	public N_QRCodeFFIAndroid(){
	}

	public Object[] execute(int index, Object[] params) {
		// TODO Auto-generated method stub
		Object[] ret = null;
 
		int paramLen = params.length;
 int inc = 1;
		switch (index) {
 		case 0:
 if (paramLen != 2){ return new Object[] {new Double(100),"Invalid Params"}; }
 com.konylabs.vm.Function callbackFunction0 = null;
 if(params[0] != null && params[0] != LuaNil.nil) {
 callbackFunction0 = (com.konylabs.vm.Function)params[0];
 }
 java.lang.String input0 = null;
 if(params[1] != null && params[1] != LuaNil.nil) {
 input0 = (java.lang.String)params[1];
 }
 ret = this.genQRCode( callbackFunction0, input0 );
 
 			break;
 		case 1:
 if (paramLen != 1){ return new Object[] {new Double(100),"Invalid Params"}; }
 com.konylabs.vm.Function callbackFunction1 = null;
 if(params[0] != null && params[0] != LuaNil.nil) {
 callbackFunction1 = (com.konylabs.vm.Function)params[0];
 }
 ret = this.scanQRCode( callbackFunction1 );
 
 			break;
 		default:
			break;
		}
 
		return ret;
	}

	public String[] getMethods() {
		// TODO Auto-generated method stub
		return methods;
	}
	public String getNameSpace() {
		// TODO Auto-generated method stub
		return "QRCodeFFIAndroid";
	}


	/*
	 * return should be status(0 and !0),address
	 */
 
 
 	public final Object[] genQRCode( com.konylabs.vm.Function inputKey0, java.lang.String inputKey1 ){
 
		Object[] ret = null;
 com.moin.qrcodeffiandroid.QRCodeFFIAndroid.generate( (com.konylabs.vm.Function)inputKey0
 , inputKey1
 );
 
 ret = new Object[]{LuaNil.nil, new Double(0)};
 		return ret;
	}
 
 
 	public final Object[] scanQRCode( com.konylabs.vm.Function inputKey0 ){
 
		Object[] ret = null;
 com.moin.qrcodeffiandroid.QRCodeFFIAndroid.scan( (com.konylabs.vm.Function)inputKey0
 );
 
 ret = new Object[]{LuaNil.nil, new Double(0)};
 		return ret;
	}
 
};
