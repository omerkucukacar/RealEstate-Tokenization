

Frontend

Important Things
# Just  be sure,for the frontend: The npv, npm and nvm extensions are installed with node.js in your computer Install these extentions to your computer.

**Be sure the XAMPP software is still running**

Put this code in package.json
"scripts": {
   "serve": "vue-cli-service serve",
   "build": "vue-cli-service build",
   "lint": "vue-cli-service lint"
},

How to run
1. Open new terminal and Go to frontend directory: run following command: cd frontend
2. Install dependencies present in package.json file: run following command: npm install
4. Run the frontend using following command: set NODE_OPTIONS=--openssl-legacy-provider
5. Run the frontend using following command: $env:NODE_OPTIONS = "--openssl-legacy-provider"
6. Run the frontend using following command: npm run serve