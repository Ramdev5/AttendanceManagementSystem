const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const EmployeeSchema = new Schema({
    employeeId: {
        type: String,
        required: true
    },
    name: {
        type: String,
        required: true
    },
    department: {
        type: String,
        required: true
    },
    position: {
        type: String,
        required: true
    },
    dateOfJoining: {
        type: Date,
        required: true
    },
    totalAttendance: {
        type: Number,
        default: 0
    },
    lastAttendanceTime: {
        type: Date,
        default: Date.now
    },
    profilePhoto: {
        url: {
            type: String,
            
        },
        filename: {
            type: String,
            
        }
    },
    contactInformation: {
        email: {
            type: String,
            required: true,
            unique: true
        },
        phone: {
            type: String,
            required: true
        }
    },
    address: {
        street: String,
        city: String,
        state: String,
        postalCode: String,
        country: String
    },
    salary: {
        type: Number,
        required: true
    },
    owner:{
        type:Schema.Types.ObjectId,
        ref:"User"
    },
    
});



module.exports = mongoose.model('Employee', EmployeeSchema);
