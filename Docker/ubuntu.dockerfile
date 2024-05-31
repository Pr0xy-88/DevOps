FROM huecker.io/library/ubuntu

RUN apt update && apt install -y openssh-server && apt install nano \
 && sed -i 's/#PermitRootLogin prohibit-password/PermitRootLogin yes/' /etc/ssh/sshd_config 
# Протестировано только с образом ubuntu:22.04

RUN echo "root:jenkins-test" | chpasswd && useradd -m -s /bin/bash jenkins \
 && echo "jenkins:jenkins" | chpasswd && touch ~/.ssh/authorized_keys

EXPOSE 22

ENTRYPOINT service ssh start && bash