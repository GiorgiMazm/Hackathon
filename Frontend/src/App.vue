<script setup></script>

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
              ref="form"
              v-model="valid"
              lazy-validation
          >
            <v-text-field
                v-model="name"
                :counter="10"
                :rules="nameRules"
                label="Name*"
                required
            ></v-text-field>

            <v-text-field
                v-model="email"
                :rules="emailRules"
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
                :rules="emailRules"
                label="Category*"
                required
            ></v-text-field>

            <v-checkbox
                v-model="checkbox"
                :rules="[v => !!v || 'You must be at least 18 to continue!']"
                label="Are you at least 18?*"
                required
            ></v-checkbox>

          </v-form>
        </v-main>
      </v-layout>
    </v-card>

  </v-app>


</template>

<style scoped>
</style>
