# Applicant API example

The online editor at http://editor.swagger.io/#/ can not only display a swagger open api yaml file, but also it can generate several different sorts of clients and servers.

Upload the file applicants-swagger-api.yml to swagger. 

At very least it will validate your api definition.

However, once validated, you can generate starter code for server that you can then run locally as you build out your API.

The editor's Generate_Server->Node.js menu item will download a zip file to your computer that is the implemenation of a Node.js server (See the enclosed README file) that you can run.
Even before you have written any of your own code the starter code will accept a PUT requests for an applicant.

unzip the downloaded server, cd into the unpacked dir, and run Node:

npm start

and you should see:

```
$ npm start

> dcs-applicants@1.0.0 prestart /Users/mzaleski/Downloads/nodejs-server-server
> npm install


> dcs-applicants@1.0.0 start /Users/mzaleski/Downloads/nodejs-server-server
> node index.js


Your server is listening on port 8080 (http://localhost:8080)
Swagger-ui is available on http://localhost:8080/docs
```

Then, browse to the URL you see and you will see a slightly different API viewer than on swagger public website.

Note: the local URL above is embedded in the swagger YAML.
