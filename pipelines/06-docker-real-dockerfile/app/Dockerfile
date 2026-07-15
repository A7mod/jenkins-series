FROM alpine:latest

LABEL maintainer="Aamod"
LABEL description="Demo image for Jenkins Docker integration practice"

WORKDIR /app

COPY hello.sh .
RUN chmod +x hello.sh

CMD ["./hello.sh"]