# Real Estate Tokenization
 
# Backend 

# How to run in local

1. Download the XAMPP sotware and install it.
2. Run the MYSQL, APACHE and TOMCAT servers.
3. Go to http://localhost/phpmyadmin/
4. Open a new database and call it (tokenization)
5. Run the arya.java file
6. After running the arya.java file is complated, go to http://localhost:8443/api/swagger-ui.html


# Frontend
# Important: Just  be sure,for the frontend: The npv, npm and nvm extensions are installed with node.js in your computer. Install these extentions to your computer.

1. Put this code in package.json

"scripts": {
   "serve": "vue-cli-service serve",
   "build": "vue-cli-service build",
   "lint": "vue-cli-service lint"
},

# How to Run
1. Open new terminal and Go to frontend directory: run following command: cd frontend
2. Install dependencies present in package.json file: run following command: npm install
3. Run the frontend using following command: set NODE_OPTIONS=--openssl-legacy-provider
4. Run the frontend using following command: $env:NODE_OPTIONS = "--openssl-legacy-provider"
5. Lastly, Run the frontend using following command: npm run serve
