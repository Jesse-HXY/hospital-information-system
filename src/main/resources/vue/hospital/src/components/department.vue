
<template>
  <div class="hello">
    <el-container>
      <el-header><h1>科室管理</h1></el-header>
      <el-aside></el-aside>
      <el-main>
        <el-table
          :data="departmentList"
          stripe
          style="width: 100%">
          <el-table-column
            prop="dId"
            label="科室编码"
            width="180">
          </el-table-column>
          <el-table-column
            prop="dName"
            label="科室名称"
            width="180">
          </el-table-column>
          <el-table-column
            prop="dCategory"
            label="科室类别">
          </el-table-column>
        </el-table>
      </el-main>
      <el-footer></el-footer>

    </el-container>
  </div>


</template>

<script>
  export default {

    name: 'department',
    data () {
      let dId = '';
      let dName='';
      let dCategory='';
      let departmentList=[];
      return {

      departmentList:departmentList
      }

    },
    created:function(){
      this.getAllDepartments();
      for (var i = 0; i < this.departmentList.length; i++) {
        this.departmentList[i].dCategory = this.getCategoryByNumber(this.departmentList[i].dCategory)

      }
    },

    methods:{
      getCategoryByNumber:function(num){
        if(num === "0"){
          return "医技"
        }else if(num === "1"){
          return "临床"
        }else if(num === "2"){
          return "行政"
        }else{
          return "财务"
        }
      },
      getAllDepartments:function () {
        let that = this;
        console.log(123)
        axios({
          url: "/api/department/getAllDepartments",
          method:"post"
        }).then(response => {

          that.departmentList = response.data
          console.log(JSON.stringify(response.data))
        }).catch(err=>{
          console.log(err)
        })
      },

    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }
  ul {
    list-style-type: none;
    padding: 0;
  }
  li {
    display: inline-block;
    margin: 0 10px;
  }
  a {
    color: #42b983;
  }
</style>
