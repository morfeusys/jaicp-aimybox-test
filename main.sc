theme: /Test
  state:
    e!: test
    script:
      Aimybox.response()
        .text("It works!")
        .button("Test again")
