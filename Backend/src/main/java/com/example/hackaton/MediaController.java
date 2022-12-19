package com.example.hackaton;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping
public class MediaController {
  MediaRepository mediaRepository;

  public MediaController(MediaRepository mediaRepository) {
    this.mediaRepository = mediaRepository;
  }

  @GetMapping(path = "allMedia")
  public List<Media> test() {
    return mediaRepository.findAll();
  }

  @GetMapping(path = "/")
  public String home() {
    return "Welcome to Backend!"
        + "<br>"
        + "to get all media:  /allMedia"
        + "<br>"
        + "to post new media: /newMedia";
  }

  @PostMapping("newMedia")
  public void registerNewMedia(@RequestBody Media media) {
    media.setCreatedAt(LocalDateTime.now());
    mediaRepository.save(media);
  }
}
