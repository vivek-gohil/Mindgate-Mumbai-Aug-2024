alert("JavaScript is running");

function validateEmployeeDetails() {
    document.getElementById("errorname").innerHTML = "";
    document.getElementById("errorage").innerHTML = "";
    document.getElementById("erroremail").innerHTML = "";
    document.getElementById("errorcountry").innerHTML = "";


    let flag = true;
    let form = document.getElementById('employeedetailsform');
    let name = form.name.value;

    if (name == '') {
        document.getElementById("errorname").innerHTML = "Enter Name";
        flag = false;
    }
    let age = form.age.value;
    if (age == '' || isNaN(age) || age == 0) {
        document.getElementById("errorage").innerHTML = "Enter Age";
        flag = false;
    }
    let email = form.email.value;
    if (email == '') {
        document.getElementById("erroremail").innerHTML = "Enter Email";
        flag = false;
    }
    if (email.indexOf('@') == -1 || email.indexOf('.') == -1) {
        document.getElementById("erroremail").innerHTML = "Invalid Email";
        flag = false;
    }
    let country = form.country.value;
    if (country == '--') {
        document.getElementById("errorcountry").innerHTML = "Select Country";
        flag = false;
    }

    return flag;

}

function test() {
    console.log(form); // form data
    console.log(name); // undefined
    let name = "";
}