import "vuetify/styles"; // Global CSS has to be
import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import {createVuetify} from "vuetify";

const app = createApp(App)
const vuetify = createVuetify();

app.use(vuetify);
app.mount("#app");
