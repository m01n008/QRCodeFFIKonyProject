define({


  onScanQRBtnClick: function(){
//#ifdef android
    QRCodeFFIAndroid.scanQRCode(this.QRScannedResultCallBack);
//#endif

//#ifdef iphone
    QRCodeFFIiOS.scanQRCode(this.QRScannedResultCallBack);
//#endif
  },

  onGenQRBtnClick: function(){
        var input = null;
//#ifdef android
         input = this.view.URLtextBox.text;
        QRCodeFFIAndroid.genQRCode(this.QRGenResultCallBack, input);
//#endif

//#ifdef iphone
         input = this.view.URLtextBox.text;
         input = {input};
        QRCodeFFIiOS.genQRCode(input, this.QRGenResultCallBack);

//#endif

  },

  QRGenResultCallBack: function(result){
//#ifdef android
    this.view.qrImage.base64 = result;
//#endif

//#ifdef iphone
    this.view.qrImage.base64 = result.base64Text;
//#endif

     this.view.qrImage.isVisible = true;


  },

  QRScannedResultCallBack: function(result){
//#ifdef android
    this.view.URLtextBox.text = result;
//#endif

//#ifdef iphone
    this.view.URLtextBox.text = result.qrlink;
//#endif

  alert("QRCode Scanned");
},
});
/*
define({ 

  onScanQRBtnClick: function(){
    QRCodeFFI.scanQRCode(this.QRScannedResultCallBack);
  },
  
  onGenQRBtnClick: function(){
    var input = "https://github.com/m01n008";
    QRCodeFFI.genQRCode(this.QRGenResultCallBack, input);
    
  },
  
  QRGenResultCallBack: function(result){
  this.view.imgQRCode.base64 = result;
  },
  
  QRScannedResultCallBack: function(result){
  alert("result: "+result);
  
 });*/
