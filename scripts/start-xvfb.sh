#!/bin/bash
set -e

apt-get update
apt-get install -y xvfb metacity
cp xvfb.init /etc/init.d/xvfb
chmod +x /etc/init.d/xvfb
update-rc.d xvfb defaults
service xvfb start
sleep 10 # give xvfb some time to start
export DISPLAY=:10
metacity --sm-disable --replace &
sleep 10 # give metacity some time to start
