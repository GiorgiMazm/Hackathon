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

            <button type="submit" @click="createMedia"> send form</button>

          </v-form>

          <div class="d-flex justify-lg-space-around flex-wrap w-100 mx-auto mt-3">
            <v-card
                class="mb-5 cardWidth"
                v-for="item in mediaArray"
            >
              <v-card-text>
                <div>Media from: {{ item.authorName }}</div>
                <p class="text-h4 text--primary">
                  {{ item.title }}
                </p>
                <p>category: {{ item.category }}</p>
                <div class="text--primary">
                  {{ item.body }}
                </div>
                <hr>

                <p>Media was accepted: {{ item.isAccepted }}</p>
                <p>Contact Author: {{ item.isAccepted }}</p>
              </v-card-text>
              <v-card-actions>
                <v-btn
                    variant="text"
                    color="deep-purple-accent-4"
                >
                  Learn More
                </v-btn>
              </v-card-actions>
            </v-card>
          </div>

        </v-main>
      </v-layout>
    </v-card>

  </v-app>


</template>

<script>
import {getMedia, mediaCreate} from "./mediaService.js";

export default {
  data() {
    return {
      checkbox: true,
      email: "",
      name: "",
      body: "",
      title: "",
      category: "",
      mediaArray: []
    };
  },

  methods: {
    createMedia() {
      const user = {
        authorName: this.name,
        title: this.title,
        body: this.body,
        category: this.category,
        isAccepted: false
      }
      mediaCreate(user)
    },
    async getAllMedia() {
      this.mediaArray = await getMedia();
    },
  },

  created() {
    this.getAllMedia()
  }
};
</script>
<style scoped>
.cardWidth{
  width: 45%;
}
</style>
