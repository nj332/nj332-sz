// 定义服务层:
app.service("orderService",function($http){
	this.findAll = function(entity){
		return $http.get("../orderShop/user.do",entity);
	}
	
	this.findPage = function(page,rows){
		return $http.get("../brand/findPage.do?pageNo="+page+"&pageSize="+rows);
	}
	
	this.add = function(entity){
		return $http.post("../orderShop/user.do",entity);
	}
	
	this.update=function(entity){
		return $http.post("../brand/update.do",entity);
	}
	
	this.findOne=function(id){
		return $http.get("../brand/findOne.do?id="+id);
	}
	
	this.dele = function(ids){
		return $http.get("../brand/delete.do?ids="+ids);
	}
	
	this.search = function(searchEntity){
		return $http.post("../orderShop2/user.do",searchEntity);
	}
	
	this.selectOptionList = function(){
		return $http.get("../brand/selectOptionList.do");
	}
});