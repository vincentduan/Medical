$.validator.setDefaults({
	submitHandler : function() {
		console.log("formAdd submit");
		$("#formAdd").submit();
	}
});
$(function() {
	$("#formAdd").validate({
		rules : {
			username : {
				required : true
			},
			englistName : {
				required : true
			},
			telphone : {
				required : true,
				number : true,
				digits : true,
				rangelength : [ 11, 11 ]
			},
			hospital : {
				required : true
			},
			department : {
				required : true
			},
			role : {
				required : true
			},
			score : {
				required : true,
				number : true
			},
			price : {
				required : true,
				number : true,
				digits : true
			},
			advantage : {
				required : true
			},
			background : {
				required : true
			},
			achievement : {
				required : true
			},
			workingexp : {
				required : true
			},
			personalclinicinfo : {
				required : true
			}
		},
		messages : {
			username : {
				required : "Please enter a username",
			}
		},
		errorElement : "em",
		errorPlacement : function(error, element) {
			// Add the `help-block` class to the error element
			error.addClass("valerror");
			if (element.prop("type") === "checkbox") {
				error.insertAfter(element.parent("label"));
			} else {
				error.insertAfter(element);
			}
		},
	});
})