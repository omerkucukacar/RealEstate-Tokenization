<template>
  <div class="container">
    <!--    Logo Div-->
    <div class="row">
      <div class="col-12 text-center pt-3">
        <router-link :to="{ name: 'Home' }">
          <img id="logo" src="../assets/icon.png" />
        </router-link>
      </div>
    </div>

    <div class="row">
      <div class="col-12 justify-content-center d-flex flex-row pt-5">
        <div id="signup-div" class="flex-item border">        
          <h3 class="pt-4 pl-4">Registration</h3>
          <form @submit="signup" class="pt-4 pl-4 pr-4">
            <div class="form-group">
              <label>Email</label>
              <input
                type="email"
                class="form-control"
                v-model="email"
                required
                />
              </div>

            <div class="form-row">
              <div class="col">
                <div class="form-group">
                  <label>First Name</label>
                  <input
                    type="name"
                    class="form-control"
                    v-model="firstName"
                    required/>
                </div>
              </div>
              <div class="col">
                <div class="form-group">
                  <label>Last Name</label>
                  <input
                    type="name"
                    class="form-control"
                    v-model="lastName"
                    required
                  />
                </div>
              </div>

              <div class="form-row">
                <div class="col">
                  
                    
                    <input style="position:relative;top:35px;"
                    type="checkbox" id="professional" value="professional" v-model="checkedNames"
                      required
                    /> 
                    <label style="position:relative;left:20px;top:35px;">Professional Account</label>
                  </div>
                
                <div class="col">
                  <div class="form-group">
                    <label>Company*</label>
                    <input
                      type="name"
                      class="form-control"
                      v-model="lastName"
                      required
                    />
                  </div>
                </div>
              </div>
              
            </div>
            <div class="form-group">
              <label>Phone Number</label>
              <input
                type="number"
                class="form-control"
                v-model="phonenumber"
                required
              />
            </div>
            <div class="form-group">
              <label>Password</label>
              <input
                type="password"
                class="form-control"
                v-model="password"
                required
              />
            </div>
            <div class="form-group">
              <label>Confirm Password</label>
              <input
                type="password"
                class="form-control"
                v-model="passwordConfirm"
                required
              />
            </div>
            <p> **We will forward you to our external partner for- you are in a quite and bright room the further identifcation process (KYC) </p>
            
            <BreadcrumbItem>
              <a href="https://www.idnow.io/">
                
                Continue with KYC-Verification >>>>>>>>>>>>></a>
             </BreadcrumbItem>
            
            <hr>

            <small class="form-text text-muted">
              <input type="checkbox" id="policy" value="policy" v-model="checkedNames" required/> 
              By creating an account, you acknowledge that you have read and understood, and agree to Terms and Conditions and Privacy Policy.</small>
            <button type="submit" class="btn btn-primary mt-2 py-0">
              Create Account
            </button>
          </form>
          <hr />
          <small class="form-text text-muted pt-2 pl-4 text-center"
            >Already Have an Account?</small
          >
          <p class="text-center">
            <router-link
              class="btn btn-dark text-center mx-auto px-5 py-1 mb-2"
              :to="{ name: 'Signin' }"
              >Log In Here</router-link
            >
          </p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Signup",
  props: ["baseURL"],
  data() {
    return {
      email: null,
      firstName: null,
      lastName: null,
      phonenumber:null,
      password: null,
      passwordConfirm: null,
    };
  },
  methods: {
    async signup(e) {
      e.preventDefault();
      // if the password matches
      if (this.password === this.passwordConfirm) {
        // make the post body
        const user = {
          email: this.email,
          firstName: this.firstName,
          lastName: this.lastName,
          phonenumber:this.phonenumber,
          password: this.password,
        };

        // call the API
        await axios
          .post(`${this.baseURL}user/signup`, user)
          .then(() => {
            // redirect to home page
            this.$router.replace("/");
            swal({
              text: "User Registration successful. Please Log-In",
              icon: "success",
              closeOnClickOutside: false,
            });
          })
          .catch((err) => {
            console.log(err);
          });
      } else {
        // passwords are not matching
        swal({
          text: "Error! Passwords are not matching",
          icon: "error",
          closeOnClickOutside: false,
        });
      }
    },
  },
};
</script>

<style scoped>
.btn-dark {
  background-color: #e7e9ec;
  color: #000;
  font-size: smaller;
  border-radius: 0;
  border-color: #adb1b8 #a2a6ac #a2a6ac;
}

.btn-primary {
  background-color: #f0c14b;
  color: black;
  border-color: #a88734 #9c7e31 #846a29;
  border-radius: 0;
}

#logo {
  width: 150px;
}

@media only screen and (min-width: 992px) {
  #signup-div {
    width: 40%;
  }
}
</style>
