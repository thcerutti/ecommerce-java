FROM node:alpine

WORKDIR /app

COPY /ecommerce-front .

RUN npm install

RUN npm run build

EXPOSE 3000

CMD ["npm", "start"]
