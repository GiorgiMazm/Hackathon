<template>

  <v-app>
    <v-card color="grey-lighten-3">
      <v-layout>
        <v-app-bar
            color="teal-darken-4"
            image="https://picsum.photos/1920/1080?random"
        >
          <template v-slot:image>
            <v-img
                gradient="to top right, rgba(19,84,122,.8), rgba(128,208,199,.8)"
            ></v-img>
          </template>

          <template v-slot:prepend>
            <v-app-bar-nav-icon></v-app-bar-nav-icon>
          </template>

          <v-app-bar-title>Hackathon</v-app-bar-title>

          <v-spacer></v-spacer>

          <v-btn icon>
            <v-icon>mdi-magnify</v-icon>
          </v-btn>

          <v-btn icon>
            <v-icon>mdi-heart</v-icon>
          </v-btn>

          <v-btn icon>
            <v-icon>mdi-dots-vertical</v-icon>
          </v-btn>
        </v-app-bar>

        <v-main>
          <h1 class="text-h1 text-center">
            Hackathon
          </h1>

          <v-form
              class="w-33"
              ref="form"
          >
            <v-text-field
                v-model="name"
                :counter="10"
                label="Name*"
                required
            ></v-text-field>

            <v-text-field
                v-model="email"
                label="E-mail*"
                required
            ></v-text-field>

            <v-text-field
                v-model="title"
                label="Betreff*"
                required
            ></v-text-field>

            <v-textarea
                v-model="body"
                label="Inhalt*"
                required
            ></v-textarea>

            <v-text-field
                v-model="category"
                label="Category*"
                required
            ></v-text-field>

            <v-checkbox
                v-model="checkbox"
                :rules="[v => !!v || 'You must be at least 18 to continue!']"
                label="Are you at least 18?*"
                required
            ></v-checkbox>

            <button type="submit" @click="createMedia($event)"> send form</button>

          </v-form>
          <button @click="getAllMedia">MEDIA</button>
        </v-main>
      </v-layout>
    </v-card>

  </v-app>


</template>

<script>
import {mediaCreate, getAllMedia} from "./mediaService.js";
export default {
  data() {
    return {
      checkbox: true,
      email: "",
      name: "",
      body: "",
      title: "",
      category: ""
    };
  },

  methods: {
    async getAllMedia() {
      console.log( await getAllMedia())
    },
    createMedia(data) {
      const user = {
        authorName: this.name,
        title: this.title,
        body: this.body,
        category: this.category,
        isAccepted: false
      }

      console.log(mediaCreate(user))
    },
  },
};
</script>
<style scoped>
</style>
