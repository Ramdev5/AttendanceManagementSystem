const employees = [
    {
        employeeId: "EMP123461",
        name: "Amit Sharma",
        department: "Engineering",
        position: "Software Developer",
        dateOfJoining: new Date("2019-05-10"),
        totalAttendance: 870,
        lastAttendanceTime: new Date("2024-08-25T09:00:00Z"),
        profilePhoto: {
            url: "https://c.stocksy.com/a/dTW500/z9/1316485.jpg",
            filename: "amit_sharma.jpg"
        },
        contactInformation: {
            email: "amitsharma@example.com",
            phone: "+919876543210"
        },
        address: {
            street: "12 Rajpath Road",
            city: "Delhi",
            state: "Delhi",
            postalCode: "110001",
            country: "India"
        },
        salary: 75000
    },
    {
        employeeId: "EMP123462",
        name: "Sonal Mehta",
        department: "Finance",
        position: "Accountant",
        dateOfJoining: new Date("2018-11-22"),
        totalAttendance: 1020,
        lastAttendanceTime: new Date("2024-08-24T10:30:00Z"),
        profilePhoto: {
            url: "https://img.freepik.com/premium-photo/professional-indian-female-headshots-business-corporate-women_203363-204.jpg",
            filename: "sonal_mehta.jpg"
        },
        contactInformation: {
            email: "sonalmehta@example.com",
            phone: "+919234567890"
        },
        address: {
            street: "45 MG Road",
            city: "Mumbai",
            state: "Maharashtra",
            postalCode: "400001",
            country: "India"
        },
        salary: 68000
    },
    {
        employeeId: "EMP123463",
        name: "Ravi Verma",
        department: "Human Resources",
        position: "HR Manager",
        dateOfJoining: new Date("2020-03-01"),
        totalAttendance: 625,
        lastAttendanceTime: new Date("2024-08-23T08:45:00Z"),
        profilePhoto: {
            url: "https://as2.ftcdn.net/v2/jpg/04/22/82/39/1000_F_422823992_ZtyrE96o6wGTJcyZolZ6pLRUGHBRCH9c.jpg",
            filename: "ravi_verma.jpg"
        },
        contactInformation: {
            email: "raviverma@example.com",
            phone: "+919098765432"
        },
        address: {
            street: "67 Nehru Avenue",
            city: "Chennai",
            state: "Tamil Nadu",
            postalCode: "600034",
            country: "India"
        },
        salary: 82000
    },
    {
        employeeId: "EMP123464",
        name: "Priya Rao",
        department: "Marketing",
        position: "Content Strategist",
        dateOfJoining: new Date("2021-07-15"),
        totalAttendance: 380,
        lastAttendanceTime: new Date("2024-08-22T09:30:00Z"),
        profilePhoto: {
            url: "https://img.freepik.com/premium-photo/business-businesswoman-office-young-girl-head-shot-woman-portrait-corporate-manager-indian-asian_901408-9565.jpg",
            filename: "priya_rao.jpg"
        },
        contactInformation: {
            email: "priyarao@example.com",
            phone: "+919876543212"
        },
        address: {
            street: "89 Brigade Road",
            city: "Bengaluru",
            state: "Karnataka",
            postalCode: "560001",
            country: "India"
        },
        salary: 72000
    },
    {
        employeeId: "EMP123465",
        name: "Vikram Singh",
        department: "Sales",
        position: "Sales Executive",
        dateOfJoining: new Date("2022-09-10"),
        totalAttendance: 245,
        lastAttendanceTime: new Date("2024-08-21T08:00:00Z"),
        profilePhoto: {
            url: "https://ysm-res.cloudinary.com/image/upload/c_limit,f_auto,h_630,q_auto,w_1200/v1/yms/prod/9ac42c3e-3d39-497b-8fd5-5131bb318b22",
            filename: "vikram_singh.jpg"
        },
        contactInformation: {
            email: "vikramsingh@example.com",
            phone: "+919876543213"
        },
        address: {
            street: "21 Park Street",
            city: "Kolkata",
            state: "West Bengal",
            postalCode: "700016",
            country: "India"
        },
        salary: 55000
    },
    {
        employeeId: "EMP123466",
        name: "Anjali Desai",
        department: "Engineering",
        position: "Junior Software Engineer",
        dateOfJoining: new Date("2021-01-10"),
        totalAttendance: 410,
        lastAttendanceTime: new Date("2024-08-20T10:15:00Z"),
        profilePhoto: {
            url: "https://thumbs.dreamstime.com/b/beautiful-indian-woman-business-attire-portrait-east-against-white-backdrop-39020458.jpg",
            filename: "anjali_desai.jpg"
        },
        contactInformation: {
            email: "anjalidesai@example.com",
            phone: "+919876543214"
        },
        address: {
            street: "55 Law College Road",
            city: "Pune",
            state: "Maharashtra",
            postalCode: "411004",
            country: "India"
        },
        salary: 60000
    },
    {
        employeeId: "EMP123467",
        name: "Rajesh Iyer",
        department: "Finance",
        position: "Financial Analyst",
        dateOfJoining: new Date("2020-06-25"),
        totalAttendance: 590,
        lastAttendanceTime: new Date("2024-08-19T07:45:00Z"),
        profilePhoto: {
            url: "https://www.herbertsmithfreehills.com/dam/jcr:fe90cd11-e13b-435a-8c96-00823e61a985/ritwik-bhattacharya_WEB.jpg",
            filename: "rajesh_iyer.jpg"
        },
        contactInformation: {
            email: "rajeshiyer@example.com",
            phone: "+919876543215"
        },
        address: {
            street: "12 Ashok Nagar",
            city: "Hyderabad",
            state: "Telangana",
            postalCode: "500020",
            country: "India"
        },
        salary: 88000
    },
    {
        employeeId: "EMP123468",
        name: "Neha Kapoor",
        department: "Human Resources",
        position: "Recruitment Specialist",
        dateOfJoining: new Date("2023-02-18"),
        totalAttendance: 180,
        lastAttendanceTime: new Date("2024-08-18T09:00:00Z"),
        profilePhoto: {
            url: "https://images.rawpixel.com/image_social_landscape/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDI0LTAxL21vdGFybzdfcGhvdG9fb2ZfaW5kaWFuX2FtZXJpY2FuX2J1c2luZXNzd29tYW5faW5fbmljZV9wcm9mZXNzaV8wM2E1NTNhNC0yYjQyLTQwZWItYmJiNC04MGRjM2M1YmIwNzlfMS5qcGc.jpg",
            filename: "neha_kapoor.jpg"
        },
        contactInformation: {
            email: "nehakapoor@example.com",
            phone: "+919876543216"
        },
        address: {
            street: "78 Bannerghatta Road",
            city: "Bengaluru",
            state: "Karnataka",
            postalCode: "560076",
            country: "India"
        },
        salary: 67000
    },
    {
        employeeId: "EMP123469",
        name: "Suresh Gupta",
        department: "Operations",
        position: "Operations Manager",
        dateOfJoining: new Date("2017-08-10"),
        totalAttendance: 1250,
        lastAttendanceTime: new Date("2024-08-17T08:15:00Z"),
        profilePhoto: {
            url: "https://images.squarespace-cdn.com/content/v1/5ad77fef3917eed8dbe6f8e1/1705779651223-PXN93VIZLTITN1HSCU6X/09-05-2023_Abhilash-Suresh_0002_(5).jpg",
            filename: "suresh_gupta.jpg"
        },
        contactInformation: {
            email: "sureshgupta@example.com",
            phone: "+919876543217"
        },
        address: {
            street: "45 R. K. Puram",
            city: "New Delhi",
            state: "Delhi",
            postalCode: "110022",
            country: "India"
        },
        salary: 95000
    },
    {
        employeeId: "EMP123470",
        name: "Kiran Patel",
        department: "Marketing",
        position: "SEO Specialist",
        dateOfJoining: new Date("2018-10-05"),
        totalAttendance: 965,
        lastAttendanceTime: new Date("2024-08-16T07:30:00Z"),
        profilePhoto: {
            url: "https://img.freepik.com/premium-photo/generative-ai-image-beautiful-indian-businesswoman-working-office_467541-5575.jpg",
            filename: "kiran_patel.jpg"
        },
        contactInformation: {
            email: "kiranpatel@example.com",
            phone: "+919876543218"
        },
        address: {
            street: "32 Naranpura",
            city: "Ahmedabad",
            state: "Gujarat",
            postalCode: "380013",
            country: "India"
        },
        salary: 73000
    }
];

module.exports = { data: employees };
