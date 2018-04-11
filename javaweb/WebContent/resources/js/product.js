$(function() {
	
	$("#add").click(function() {
		$("input[type='file']").trigger('click');
	});
	$("#url").click(function() {
		$("input[type='file']").trigger('click');
	});
	$("input[type='file']").change(function() {
		$("#url").html($(this).val());
	});
	
	
	////////////////////
	
	
	$("#go").click(function(){
		
		var formdata = new FormData(); //h5 容器--> 和表单一样
		formdata.append("files" , $("#files")[0].files[0]);    
		//在 0.1 毫秒内  快速的显示出进度条
		$("#process-contianer").show(100);
		
		$.ajax({
			url : 'http://localhost:8080/javaweb/file', 
			type : 'post' , 
			data : formdata , 
			processData : false , 
			contentType : false , 
			xhr : function() {   //xhr ---> level 2
				var xhr = $.ajaxSettings.xhr();  //在 jq 中 获取原生的 xhr 对象 , 绑定进度时间

				xhr.upload.onprogress = function(e) { //当上传过程中 . . .
					if(e.lengthComputable) {
						var precent = e.loaded * 100 / e.total ;
						$("#process").width(precent*2.2); //控制进度条
						$("#process").html(Math.floor(precent,2)+"%")   //显示百分比
					}
				}
				return xhr;
			} , 
			success : function(data) {
				alert("文件上传成功 . . . ")
			}
		});
		
		
	})
	
	
	
});



