const mongoose=require("mongoose");
const initData=require("./data.js");
const Employee=require("../models/Employee.js");


main()
.then(()=>{
    console.log("Connection Sucessful");
})
.catch((err)=>{
    console.log(err);
});

async function main(){
    await mongoose.connect('mongodb://127.0.0.1:27017/Employee');

}

const initDB=async ()=>{
    await Employee.deleteMany({});
    initData.data=initData.data.map((obj)=>({...obj,owner:"66d0650103147610971bb8f0"}));
    await Employee.insertMany(initData.data);
    console.log("data was initialized");

};

initDB();
