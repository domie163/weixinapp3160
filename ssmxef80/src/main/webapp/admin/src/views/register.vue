<template>
  <div>
    <div class="container">
      <div class="login-form" style="backgroundColor:rgba(255, 255, 255, 0.22);borderRadius:10px">
        <h1 class="h1" style="color:rgba(104, 223, 240, 1);fontSize:28px;">客运自助售票小程序注册</h1>
		<el-form ref="rgsForm" class="rgs-form" :model="rgsForm" label-width="120px">
															<!-- <div v-if="tableName=='chengke'" class="input-group">
			   <div class="label">用户名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.yonghuming" class="input" type="text" placeholder="用户名">
			   </div>
			 </div> -->
			<el-form-item label="用户名" class="input" v-if="tableName=='chengke'">
			  <el-input v-model="ruleForm.yonghuming" autocomplete="off" placeholder="用户名" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='chengke'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='chengke'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='chengke'" class="input-group">
			   <div class="label">姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.xingming" class="input" type="text" placeholder="姓名">
			   </div>
			 </div> -->
			<el-form-item label="姓名" class="input" v-if="tableName=='chengke'">
			  <el-input v-model="ruleForm.xingming" autocomplete="off" placeholder="姓名" type="text" />
			</el-form-item>
																														<!-- <div v-if="tableName=='chengke'" class="input-group">
			   <div class="label">身份证</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shenfenzheng" class="input" type="text" placeholder="身份证">
			   </div>
			 </div> -->
			<el-form-item label="身份证" class="input" v-if="tableName=='chengke'">
			  <el-input v-model="ruleForm.shenfenzheng" autocomplete="off" placeholder="身份证" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='chengke'" class="input-group">
			   <div class="label">手机</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shouji" class="input" type="text" placeholder="手机">
			   </div>
			 </div> -->
			<el-form-item label="手机" class="input" v-if="tableName=='chengke'">
			  <el-input v-model="ruleForm.shouji" autocomplete="off" placeholder="手机" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='chengke'" class="input-group">
			   <div class="label">家庭地址</div>
			   <div class="input-container">
			     <input v-model="ruleForm.jiatingdizhi" class="input" type="text" placeholder="家庭地址">
			   </div>
			 </div> -->
			<el-form-item label="家庭地址" class="input" v-if="tableName=='chengke'">
			  <el-input v-model="ruleForm.jiatingdizhi" autocomplete="off" placeholder="家庭地址" type="text" />
			</el-form-item>
																								<!-- <div v-if="tableName=='siji'" class="input-group">
			   <div class="label">账号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.zhanghao" class="input" type="text" placeholder="账号">
			   </div>
			 </div> -->
			<el-form-item label="账号" class="input" v-if="tableName=='siji'">
			  <el-input v-model="ruleForm.zhanghao" autocomplete="off" placeholder="账号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='siji'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='siji'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='siji'" class="input-group">
			   <div class="label">姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.xingming" class="input" type="text" placeholder="姓名">
			   </div>
			 </div> -->
			<el-form-item label="姓名" class="input" v-if="tableName=='siji'">
			  <el-input v-model="ruleForm.xingming" autocomplete="off" placeholder="姓名" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='siji'" class="input-group">
			   <div class="label">身份证</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shenfenzheng" class="input" type="text" placeholder="身份证">
			   </div>
			 </div> -->
			<el-form-item label="身份证" class="input" v-if="tableName=='siji'">
			  <el-input v-model="ruleForm.shenfenzheng" autocomplete="off" placeholder="身份证" type="text" />
			</el-form-item>
																					<!-- <div v-if="tableName=='siji'" class="input-group">
			   <div class="label">手机号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shoujihao" class="input" type="text" placeholder="手机号">
			   </div>
			 </div> -->
			<el-form-item label="手机号" class="input" v-if="tableName=='siji'">
			  <el-input v-model="ruleForm.shoujihao" autocomplete="off" placeholder="手机号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='siji'" class="input-group">
			   <div class="label">客车车牌号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.kechechepaihao" class="input" type="text" placeholder="客车车牌号">
			   </div>
			 </div> -->
			<el-form-item label="客车车牌号" class="input" v-if="tableName=='siji'">
			  <el-input v-model="ruleForm.kechechepaihao" autocomplete="off" placeholder="客车车牌号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='siji'" class="input-group">
			   <div class="label">客车类型</div>
			   <div class="input-container">
			     <input v-model="ruleForm.kecheleixing" class="input" type="text" placeholder="客车类型">
			   </div>
			 </div> -->
			<el-form-item label="客车类型" class="input" v-if="tableName=='siji'">
			  <el-input v-model="ruleForm.kecheleixing" autocomplete="off" placeholder="客车类型" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='siji'" class="input-group">
			   <div class="label">客车价格</div>
			   <div class="input-container">
			     <input v-model="ruleForm.kechejiage" class="input" type="text" placeholder="客车价格">
			   </div>
			 </div> -->
			<el-form-item label="客车价格" class="input" v-if="tableName=='siji'">
			  <el-input v-model="ruleForm.kechejiage" autocomplete="off" placeholder="客车价格" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='siji'" class="input-group">
			   <div class="label">核载人数</div>
			   <div class="input-container">
			     <input v-model="ruleForm.hezairenshu" class="input" type="text" placeholder="核载人数">
			   </div>
			 </div> -->
			<el-form-item label="核载人数" class="input" v-if="tableName=='siji'">
			  <el-input v-model="ruleForm.hezairenshu" autocomplete="off" placeholder="核载人数" type="text" />
			</el-form-item>
																																																																					<el-button class="btn" type="primary" @click="login()">注册</el-button>
		</el-form>
      </div>
      <!-- <div class="nk-navigation">
        <a href="#">
          <div @click="login()">注册</div>
        </a>
      </div> -->
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      ruleForm: {
              },
      tableName:"",
      rules: {}
    };
  },
  mounted(){
    let table = this.$storage.get("loginTable");
    this.tableName = table;
  },
  methods: {
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 注册
    login() {
                              if((!this.ruleForm.yonghuming) && `chengke` == this.tableName){
        this.$message.error(`用户名不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `chengke` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                  if((!this.ruleForm.xingming) && `chengke` == this.tableName){
        this.$message.error(`姓名不能为空`);
        return
      }
                                                                                                                                                                              if((!this.ruleForm.shenfenzheng) && `chengke` == this.tableName){
        this.$message.error(`身份证不能为空`);
        return
      }
                                                if(`chengke` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
                              if((!this.ruleForm.shouji) && `chengke` == this.tableName){
        this.$message.error(`手机不能为空`);
        return
      }
                                    if(`chengke` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入手机格式`);
        return
      }
                                                                                                                        if((!this.ruleForm.zhanghao) && `siji` == this.tableName){
        this.$message.error(`账号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `siji` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                  if((!this.ruleForm.xingming) && `siji` == this.tableName){
        this.$message.error(`姓名不能为空`);
        return
      }
                                                                  if((!this.ruleForm.shenfenzheng) && `siji` == this.tableName){
        this.$message.error(`身份证不能为空`);
        return
      }
                                                if(`siji` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
                                                                                    if((!this.ruleForm.shoujihao) && `siji` == this.tableName){
        this.$message.error(`手机号不能为空`);
        return
      }
                                    if(`siji` == this.tableName && this.ruleForm.shoujihao&&(!this.$validate.isMobile(this.ruleForm.shoujihao))){
        this.$message.error(`手机号应输入手机格式`);
        return
      }
                                          if((!this.ruleForm.kechechepaihao) && `siji` == this.tableName){
        this.$message.error(`客车车牌号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.kecheleixing) && `siji` == this.tableName){
        this.$message.error(`客车类型不能为空`);
        return
      }
                                                                                                                                                                                                                                                                                                this.$http({
        url: `${this.tableName}/register`,
        method: "post",
        data:this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "注册成功",
            type: "success",
            duration: 1500,
            onClose: () => {
              this.$router.replace({ path: "/login" });
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.h1 {
		margin-top: 10px;
	}

	body {
		padding: 0;
		margin: 0;
	}

	// .container {
 //    min-height: 100vh;
 //    text-align: center;
 //    // background-color: #00c292;
 //    padding-top: 20vh;
 //    background-image: url(../assets/img/bg.jpg);
 //    background-size: 100% 100%;
 //    opacity: 0.9;
 //  }

	// .login-form:before {
	// 	vertical-align: middle;
	// 	display: inline-block;
	// }

	// .login-form {
	// 	max-width: 500px;
	// 	padding: 20px 0;
	// 	width: 80%;
	// 	position: relative;
	// 	margin: 0 auto;

	// 	.label {
	// 		min-width: 60px;
	// 	}

	// 	.input-group {
	// 		max-width: 500px;
	// 		padding: 20px 0;
	// 		width: 80%;
	// 		position: relative;
	// 		margin: 0 auto;
	// 		display: flex;
	// 		align-items: center;

	// 		.input-container {
	// 			display: inline-block;
	// 			width: 100%;
	// 			text-align: left;
	// 			margin-left: 10px;
	// 		}

	// 		.icon {
	// 			width: 30px;
	// 			height: 30px;
	// 		}

	// 		.input {
	// 			position: relative;
	// 			z-index: 2;
	// 			float: left;
	// 			width: 100%;
	// 			margin-bottom: 0;
	// 			box-shadow: none;
	// 			border-top: 0px solid #ccc;
	// 			border-left: 0px solid #ccc;
	// 			border-right: 0px solid #ccc;
	// 			border-bottom: 1px solid #ccc;
	// 			padding: 0px;
	// 			resize: none;
	// 			border-radius: 0px;
	// 			display: block;
	// 			width: 100%;
	// 			height: 34px;
	// 			padding: 6px 12px;
	// 			font-size: 14px;
	// 			line-height: 1.42857143;
	// 			color: #555;
	// 			background-color: #fff;
	// 		}

	// 	}
	// }

	.nk-navigation {
		margin-top: 15px;

		a {
			display: inline-block;
			color: #fff;
			background: rgba(255, 255, 255, .2);
			width: 100px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;
		}

		.icon {
			margin-left: 10px;
			width: 30px;
			height: 30px;
		}
	}

	.register-container {
		margin-top: 10px;

		a {
			display: inline-block;
			color: #fff;
			max-width: 500px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;

			div {
				margin-left: 10px;
			}
		}
	}
	
	.container {
		background-image: url("http://codegen.caihongy.cn/20201206/386e55b97f7b4b4a8ecc5fd3c6df11e3.jpg");
		height: 100vh;
		background-position: center center;
		background-size: cover;
		background-repeat: no-repeat;
	
		.login-form {
			right: 50%;
			top: 50%;
			height: auto;
			transform: translate3d(50%, -50%, 0);
			border-radius: 10px;
			background-color: rgba(255,255,255,.5);
			width: 420px;
			padding: 30px 30px 40px 30px;
			font-size: 14px;
			font-weight: 500;
			
			.h1 {
				margin: 0;
				text-align: center;
				line-height: 54px;
			    font-size: 24px;
			    color: #000;
			}
				
			.rgs-form {
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				
				.input {
					width: 100%;
					
					& /deep/ .el-form-item__label {
						line-height: 40px;
						color: rgba(104, 223, 240, 1);
						font-size: #606266;
					}
					
					& /deep/ .el-input__inner {
						height: 40px;
						color: #606266;
						font-size: 14px;
						border-width: 1px;
						border-style: solid;
						border-color: #606266;
						border-radius: 4px;
						background-color: #fff;
					}
				}
				
				.btn {
					width: 88px;
					height: 44px;
					color: #fff;
					font-size: 14px;
					border-width: 0px;
					border-style: solid;
					border-color: #409EFF;
					border-radius: 4px;
					background-color: rgba(104, 223, 240, 1);
				}
			}
		}
	}
</style>
