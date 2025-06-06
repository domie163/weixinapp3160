const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmxef80/",
            name: "ssmxef80",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmxef80/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "客运自助售票小程序"
        } 
    }
}
export default base
