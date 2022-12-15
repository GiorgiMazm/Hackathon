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
        </v-main>
      </v-layout>
    </v-card>

  </v-app>


</template>

<style scoped>
</style>
