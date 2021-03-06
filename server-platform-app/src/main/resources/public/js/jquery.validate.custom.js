$.validator.addMethod("valueNotEquals", function(value, element, arg){
    return arg != value;
}, "值不能为 arg.");

$.validator.addMethod("valueNotNull", function(value, element){
    return value && value != '';
}, "必填字段");

// 字符验证，只能包含中文、英文、数字、下划线等字符。
jQuery.validator.addMethod("stringCheck", function(value, element) {
    return this.optional(element) || /^[a-zA-Z0-9\u4e00-\u9fa5-_]+$/.test(value);
}, "只能包含中文、英文、数字、下划线等字符");

jQuery.validator.addMethod("money", function(value, element) {
    return this.optional(element) || /^\$?[0-9][0-9\,]*(\.\d{1,2})?$|^\$?[\.]([\d][\d]?)$/.test(value);
}, "请输入规范的价格，小数后保留两位.");